<div class="cuerpo" >

  <div class="row">

  <form id= "consulta_1" class="form-horizontal" method="post" >
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
       <select id = "dpto" class="btn btn-lg" name="dpto">
          <option  value="">seleccione departamento</option>
          {foreach from=$departamentos item=dpto}
          <option  value="{$dpto['id_dpto']}">{$dpto['descripcion']}</option>
          {/foreach}
       </select>
       <input type="date" name="fecha" id="fecha" class="btn btn-lg" >
      <button  class="btn btn-warning btn-lg" type="submit" > Consultar <span class="glyphicon glyphicon-search"></span> </button>
    </div>

  </form>

   </div>

</div>
