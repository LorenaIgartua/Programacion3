
<?php
include_once 'libs/Smarty.class.php';
class View
{
function __construct()
  {
  $this->smarty = new Smarty();
  $this->smarty->assign('titulo', 'Air Sonia');
  }


function mostrarIndex()
		{
		return $this->smarty->display('templates/index.tpl');
		}

function mostrarHome($departamentos , $ciudades)
		{
		$this->smarty->assign('departamentos', $departamentos);
		$this->smarty->assign('ciudades', $ciudades);
		return $this->smarty->display('templates/home.tpl');
		}

    function mostrarservicio_1($departamentos, $fecha, $dias, $error)
    		{
          $this->smarty->assign('fecha', $fecha);
      		$this->smarty->assign('departamentos', $departamentos);
      		$this->smarty->assign('dias', $dias);
      		$this->smarty->assign('error', $error);
    		  return $this->smarty->display('templates/servicio_1.tpl');
    		}

function mostrarservicio_2($ciudad, $fecha1, $fecha2, $departamentos, $ciudades, $error)
		{
      $this->smarty->assign('fecha1', $fecha1);
      $this->smarty->assign('fecha2', $fecha2);
      $this->smarty->assign('ciudad', $ciudad);
  		$this->smarty->assign('departamentos', $departamentos);
  		$this->smarty->assign('ciudades', $ciudades);
  		$this->smarty->assign('error', $error);
		  return $this->smarty->display('templates/servicio_2.tpl');
		}

    function mostrarservicio_3($fecha, $departamentos, $ciudades, $error)
    		{
    		$this->smarty->assign('fecha', $fecha);
    		$this->smarty->assign('departamentos', $departamentos);
    		$this->smarty->assign('ciudades', $ciudades);
    		$this->smarty->assign('error', $error);
    		return $this->smarty->display('templates/servicio_3.tpl');
    		}

}

?>
