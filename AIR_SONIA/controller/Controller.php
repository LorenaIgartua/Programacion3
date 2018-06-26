
<?php
include_once 'view/View.php';
include_once 'model/Model.php';


class Controller
	{

	function __construct()
		{
		$this->view = new View();
		$this->model = new Model();
		}

	function index()
		{
		$this->view->mostrarIndex();
		}

	function home()
		{
		$departamentos = $this->model->obtenerDepartamentos();
		$ciudades = $this->model->obtenerCiudades();
		$this->view->mostrarHome($departamentos, $ciudades);
		}

		function servicio_1()
			{
			$fecha = isset($_POST['fecha']) ? $_POST['fecha'] : null;
			$dpto = isset($_POST['dpto']) ? $_POST['dpto'] : null;
			$departamentos = $this->model->obtenerDepartamentos();
			if ($fecha == null) {
				$this->view->mostrarservicio_1($departamentos, $fecha, $dias = '', $error = '');
			}
			else {
			$dias = $this->model->obtenerReservasXDepartamento($dpto, $fecha);
			$this->view->mostrarservicio_1($departamentos, $fecha, $dias, $error = '');
				}
			}

	function servicio_2()
		{
		$fecha1 = isset($_POST['fecha1']) ? $_POST['fecha1'] : null;
		$fecha2 = isset($_POST['fecha2']) ? $_POST['fecha2'] : null;
		$ciudad = isset($_POST['id_ciudad']) ? $_POST['id_ciudad'] : null;
		$ciudades = $this->model->obtenerCiudades();
		if (($fecha1 == null) || ($fecha2 == null)){
			$this->view->mostrarservicio_2($ciudad, $fecha1, $fecha2,  $departamentos = '', $ciudades, $error = '');
		}
		else if (!$ciudad){
			$this->view->mostrarservicio_2($fecha1 = '', $fecha2 = '' , $ciudad = '', $departamentos = '', $ciudades, $error = 'DEBE SELECCIONAR UNA CIUDAD');
		}
		else if ($fecha1 > $fecha2 ){
			$this->view->mostrarservicio_2($fecha1 = '', $fecha2 = '' , $ciudad = '', $departamentos = '', $ciudades, $error = 'EL RANGO DE FECHAS INGRESADO NO ES CORRECTO');
		}

		else {
		$departamentos = $this->model->obtenerDepartamentosXrango($fecha1,$fecha2,$ciudad);
		$this->view->mostrarservicio_2($ciudad, $fecha1, $fecha2, $departamentos, $ciudades, $error = '');
			}
		}

		function servicio_3()
		{
		$fecha = isset($_POST['fecha']) ? $_POST['fecha'] : null;
		if ($fecha == null) {
			$this->view->mostrarservicio_3($fecha, $departamentos = '', $ciudades = '', $error = '');
		}else {
		$ciudades = $this->model->obtenerCiudades();
		$departamentos = $this->model->obtenerDepartamentosXdia($fecha);
		$this->view->mostrarservicio_3($fecha, $departamentos, $ciudades , $error = '');
		}
		}

	}

?>
