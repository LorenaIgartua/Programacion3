<div class="cuerpo" >

  <div class="row">

  <form id= "consulta_2" class="form-horizontal" method="post" >
    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
       <select id = "id_ciudad" class="btn btn-lg" name="id_ciudad">
          <option  value="">todas las ciudades</option>
          {foreach from=$ciudades item=c}
          <option  value="{$c['id_ciudad']}">{$c['nombre']}</option>
          {/foreach}
       </select>
    </div>
  	<input type="date" name="fecha1" id="fecha1" class="btn btn-lg" >
    <input type="date" name="fecha2" id="fecha2" class="btn btn-lg" >
  	<button  class="btn btn-warning btn-lg" type="submit" > Consultar <span class="glyphicon glyphicon-search"></span> </button>
  </form>

   </div>

</div>
