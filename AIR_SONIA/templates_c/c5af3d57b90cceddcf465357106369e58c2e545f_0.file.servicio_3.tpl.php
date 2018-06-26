<?php
/* Smarty version 3.1.31, created on 2018-06-26 02:30:45
  from "C:\xampp\htdocs\proyectos\AIR_SONIA\templates\servicio_3.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.31',
  'unifunc' => 'content_5b318935cc34c7_37771232',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'c5af3d57b90cceddcf465357106369e58c2e545f' => 
    array (
      0 => 'C:\\xampp\\htdocs\\proyectos\\AIR_SONIA\\templates\\servicio_3.tpl',
      1 => 1529972615,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
    'file:filtro_servicio_3.tpl' => 1,
  ),
),false)) {
function content_5b318935cc34c7_37771232 (Smarty_Internal_Template $_smarty_tpl) {
?>
<div class="cuerpo">
   <h1>Servicio 3</h1>

   <?php if (!empty($_smarty_tpl->tpl_vars['error']->value)) {?>

   <div class="alert alert-danger row" role="alert"><?php echo $_smarty_tpl->tpl_vars['error']->value;?>
</div>
   <?php }?>
	<?php $_smarty_tpl->_subTemplateRender("file:filtro_servicio_3.tpl", $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, false);
?>

	<?php if (!empty($_smarty_tpl->tpl_vars['fecha']->value)) {?>
	<h2> la ocupacion al <?php echo $_smarty_tpl->tpl_vars['fecha']->value;?>
 es </h2>

   <div class="departamentos col-lg-12 col-md-12 col-sm-12 col-xs-12">
      <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['ciudades']->value, 'ciudad');
if ($_from !== null) {
foreach ($_from as $_smarty_tpl->tpl_vars['ciudad']->value) {
?>
      <h3><?php echo $_smarty_tpl->tpl_vars['ciudad']->value['nombre'];?>
</h3>
      <table class="table table-responsive" id = "<?php echo $_smarty_tpl->tpl_vars['ciudades']->value['nombre'];?>
" >
        <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['departamentos']->value, 'departamento');
if ($_from !== null) {
foreach ($_from as $_smarty_tpl->tpl_vars['departamento']->value) {
?>
         <?php if (($_smarty_tpl->tpl_vars['departamento']->value['id_ciudad'] == $_smarty_tpl->tpl_vars['ciudad']->value['id_ciudad'])) {?>
         <tr>
            <td id="descripcion" class = "celda_descripcion" ><?php echo $_smarty_tpl->tpl_vars['departamento']->value['descripcion'];?>
  </td>
			<td id="descripcion" class = "celda_precio" ><?php echo $_smarty_tpl->tpl_vars['departamento']->value['superficie'];?>
  Mts2</td>
			<td id="descripcion" class = "celda_precio" >$ <?php echo $_smarty_tpl->tpl_vars['departamento']->value['precio_noche'];?>
  </td>
			<td id="descripcion" class = "celda_precio" > <?php echo $_smarty_tpl->tpl_vars['departamento']->value['estado'];?>
  </td>
         </tr>
         <?php }?>
         <?php
}
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);
?>

      </table>
      <?php
}
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);
?>

   </div>
<?php }?>
</div>
<?php }
}
