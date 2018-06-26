<?php
/* Smarty version 3.1.31, created on 2018-06-25 13:41:44
  from "C:\xampp\htdocs\c6\templates\home.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.31',
  'unifunc' => 'content_5b30d4f8ab3fd6_18032738',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '7881311720743a67e336a0e27483771bbf4a6050' => 
    array (
      0 => 'C:\\xampp\\htdocs\\c6\\templates\\home.tpl',
      1 => 1529926899,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5b30d4f8ab3fd6_18032738 (Smarty_Internal_Template $_smarty_tpl) {
?>
<div class="cuerpo">
   <div >
      <h1>Air Sonia</h1>
      <h2>“Donde tu viaje comienza... ”</h2>
   </div>
 
 <div class="departamentos col-lg-12 col-md-12 col-sm-12 col-xs-12">
      <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['ciudades']->value, 'ciudad');
if ($_from !== null) {
foreach ($_from as $_smarty_tpl->tpl_vars['ciudad']->value) {
?>
      <h3><?php echo $_smarty_tpl->tpl_vars['ciudad']->value['nombre'];?>
</h3>  
      <table class="departamento" id = "<?php echo $_smarty_tpl->tpl_vars['ciudades']->value['nombre'];?>
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
 
 
</div>
<?php }
}
