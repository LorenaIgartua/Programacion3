
<?php

define('DB_HOST', 'dbases.exa.unicen.edu.ar');
define('PORT', '6432');
define('DB_NAME', 'cursada');
define('DB_USER', 'unc_249064');
define('DB_PASS', '26590121');

class Model

	{
protected $db;
	function __construct()
		{
		try
			{
						$this->db = new PDO("pgsql:host=".DB_HOST.";port=". PORT.";dbname=". DB_NAME, DB_USER , DB_PASS);
			}

		catch(PDOException $e)
			{
			echo (" -- DEBE COMPLETAR LOS DATOS DE CONEXION EN EL ARCHIVO MODEL.PHP DE LA CARPETA MODEL");
			die();
			}
		}

		// function sentencia1($no_lo_uso)
		// {
		// 	$sentencia = $this->db->prepare("Select * from GR09_departamento");
		// 	$sentencia->execute();
		// 	$resultado= $sentencia->fetchAll(PDO::FETCH_ASSOC);
		//  	return $resultado;
		// }


	function obtenerCiudades()
		{
			$sentencia = $this->db->prepare("Select * from GR09_ciudad");
			$sentencia->execute();
			$ciudad = $sentencia->fetchAll(PDO::FETCH_ASSOC);
		 	return $ciudad;
		}

	function obtenerDepartamentos()
		{
			$sentencia = $this->db->prepare("Select * from GR09_departamento");
			$sentencia->execute();
			$departamento = $sentencia->fetchAll(PDO::FETCH_ASSOC);
		 	return $departamento;
		}


		function obtenerReservasXDepartamento($dpto, $fecha)
		{
			$sentencia = $this->db->prepare("
						SELECT  r.fecha_desde, r.fecha_hasta
			FROM gr09_departamento d
			    INNER JOIN gr09_reserva r ON (r.id_dpto = d.id_dpto)
			WHERE  d.id_dpto = ?
			    AND extract(year from r.fecha_desde) = extract(year from ?)
			    AND  extract(month from r.fecha_desde) = extract(month from ?)
			");
			$sentencia->execute([$dpto, $fecha, $fecha]);

			$dias = $sentencia->fetchAll(PDO::FETCH_ASSOC);
			print_r($dias);
		 	return $dias;
		}

		function obtenerDepartamentosXdia($fecha)
		{
			$sentencia = $this->db->prepare("
			SELECT
				*,
			case when ( (Select 1 FROM gr09_departamento d1
                INNER JOIN gr09_reserva r ON (r.id_dpto = d1.id_dpto)
                Where  d.id_dpto = d1.id_dpto and
                ?  BETWEEN r.fecha_desde and r.fecha_hasta) =1 )
				then 'OCUPADO'
			else 'LIBRE' end as estado
			FROM gr09_departamento d");
			$sentencia->execute([$fecha]);
			$departamento = $sentencia->fetchAll(PDO::FETCH_ASSOC);
		 	return $departamento;
		}


	function obtenerDepartamentosXrango($fecha1,$fecha2,$ciudad)
	{
		$sentencia = $this->db->prepare("
	 SELECT d1.*
		 FROM gr09_departamento d1
		WHERE d1.id_dpto NOT IN (SELECT d.id_dpto
		                        	FROM gr09_departamento d
		                               INNER JOIN gr09_reserva r ON (r.id_dpto = d.id_dpto)
		                           WHERE  d.id_ciudad = ?
	                               AND ( r.fecha_desde  BETWEEN ? and ?
		                                  or r.fecha_hasta  BETWEEN ? and ?
		                                  or ? BETWEEN r.fecha_desde and r.fecha_hasta
		                                  or ?  BETWEEN r.fecha_desde and r.fecha_hasta
		                                ))");
		$sentencia->execute([$ciudad,$fecha1,$fecha2,$fecha1,$fecha2,$fecha1,$fecha2]);
		$departamento = $sentencia->fetchAll(PDO::FETCH_ASSOC);
		return $departamento;
	}
	}

?>
