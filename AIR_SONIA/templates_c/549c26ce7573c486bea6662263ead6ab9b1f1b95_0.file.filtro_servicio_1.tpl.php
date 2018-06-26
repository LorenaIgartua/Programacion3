<?php
/* Smarty version 3.1.31, created on 2018-06-26 04:39:41
  from "C:\xampp\htdocs\proyectos\AIR_SONIA\templates\filtro_servicio_1.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.31',
  'unifunc' => 'content_5b31a76de69160_91308948',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '549c26ce7573c486bea6662263ead6ab9b1f1b95' => 
    array (
      0 => 'C:\\xampp\\htdocs\\proyectos\\AIR_SONIA\\templates\\filtro_servicio_1.tpl',
      1 => 1529975386,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_5b31a76de69160_91308948 (Smarty_Internal_Template $_smarty_tpl) {
?>
<div class="cuerpo" >

  <div class="row">

  <form id= "consulta_1" class="form-horizontal" method="post" >
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
       <select id = "dpto" class="btn btn-lg" name="dpto">
          <option  value="">seleccione departamento</option>
          <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['departamentos']->value, 'dpto');
if ($_from !== null) {
foreach ($_from as $_smarty_tpl->tpl_vars['dpto']->value) {
?>
          <option  value="<?php echo $_smarty_tpl->tpl_vars['dpto']->value['id_dpto'];?>
"><?php echo $_smarty_tpl->tpl_vars['dpto']->value['descripcion'];?>
</option>
          <?php
}
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl, 1);
?>

       </select>
       <input type="date" name="fecha" id="fecha" class="btn btn-lg" >
      <button  class="btn btn-warning btn-lg" type="submit" > Consultar <span class="glyphicon glyphicon-search"></span> </button>
    </div>

  </form>

   </div>

</div>
<?php }
}
