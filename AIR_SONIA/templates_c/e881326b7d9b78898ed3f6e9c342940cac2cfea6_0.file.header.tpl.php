<?php
/* Smarty version 3.1.31, created on 2018-06-25 13:25:21
  from "C:\xampp\htdocs\c6\templates\header.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.31',
  'unifunc' => 'content_5b30d12187cad2_41538464',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'e881326b7d9b78898ed3f6e9c342940cac2cfea6' => 
    array (
      0 => 'C:\\xampp\\htdocs\\c6\\templates\\header.tpl',
      1 => 1529924692,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5b30d12187cad2_41538464 (Smarty_Internal_Template $_smarty_tpl) {
?>
<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
      <title><?php ob_start();
echo $_smarty_tpl->tpl_vars['titulo']->value;
$_prefixVariable1=ob_get_clean();
echo $_prefixVariable1;?>
</title>
      <!-- Bootstrap -->
      <!-- <link href="css/bootstrap.min.css" rel="stylesheet"> -->
      <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"> -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
      <link rel="stylesheet" href="css/style.css">


   </head>
   <body>
      <header>
         <div class="row">
            <!-- logo y datos -->
            <div class="logo col-lg-2 col-md-2 col-sm-6 col-xs-12">
               <a href="home" id = "nav_logo"> <img src="images/logo.png" alt="Air Sonia" class="logo" > </a>
            </div>
        </header>
      <div class="barra"> <!-- barra de navegacion -->
      <nav class="navbar navbar-default">
      <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      </button>
      </div>
      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <li > <a href= "#" id= "nav_inicio"> Inicio </a> </li>
      <li > <a href= "#" id= "nav_servicio_1"> Servicio 1 </a> </li>
	  <li > <a href= "#" id= "nav_servicio_2"> Servicio 2 </a> </li> 
      </ul>
      </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
      </nav>
      </div>
      </div>  <!-- fin  barra de navegacion -->
<?php }
}
