<?php
/* Smarty version 3.1.31, created on 2018-06-25 19:16:07
  from "C:\xampp\htdocs\proyectos\AIR_SONIA\templates\filtro_servicio_2.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.31',
  'unifunc' => 'content_5b3123573a6386_41839490',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'f9820374c29e54ac2c58f2021dd1055e1164685a' => 
    array (
      0 => 'C:\\xampp\\htdocs\\proyectos\\AIR_SONIA\\templates\\filtro_servicio_2.tpl',
      1 => 1529935694,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5b3123573a6386_41839490 (Smarty_Internal_Template $_smarty_tpl) {
?>
<div class="cuerpo" >

  <div class="row">

  <form id= "consulta_2" class="form-horizontal" method="post" >
    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
       <select id = "id_ciudad" class="btn btn-lg" name="id_ciudad">
          <option  value="">todas las ciudades</option>
          <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['ciudades']->value, 'c');
if ($_from !== null) {
foreach ($_from as $_smarty_tpl->tpl_vars['c']->value) {
?>
          <option  value="<?php echo $_smarty_tpl->tpl_vars['c']->value['id_ciudad'];?>
"><?php echo $_smarty_tpl->tpl_vars['c']->value['nombre'];?>
</option>
          <?php
}
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);
?>

       </select>
    </div>
  	<input type="date" name="fecha1" id="fecha1" class="btn btn-lg" >
    <input type="date" name="fecha2" id="fecha2" class="btn btn-lg" >
  	<button  class="btn btn-warning btn-lg" type="submit" > Consultar <span class="glyphicon glyphicon-search"></span> </button>
  </form>

   </div>

</div>
<?php }
}
