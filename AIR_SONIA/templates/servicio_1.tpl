<div class="cuerpo">
   <h1>Servicio 1</h1>

   {include file="filtro_servicio_1.tpl"}

   {if !empty($error) }
   <div class="alert alert-danger row" role="alert">{$error}</div>
   {/if}

{if !empty($fecha) }

<h2> los departamentos disponibles en

  {foreach from=$ciudades item=c}
     {if ($ciudad==$c['id_ciudad'])}
    {$c['nombre']}
     {/if}
     {/foreach}
 entre  {$fecha1} y {$fecha2} son </h2>

<div class="departamentos col-lg-12 col-md-12 col-sm-12 col-xs-12">
   <table class="table table-responsive" id = "{$ciudades['nombre']}" >
     {foreach from=$departamentos item=departamento}
      <tr>
         <td id="descripcion" class = "celda_descripcion" >{$departamento['descripcion']}  </td>
   <td id="descripcion" class = "celda_precio" >{$departamento['superficie']}  Mts2</td>
   <td id="descripcion" class = "celda_precio" >$ {$departamento['precio_noche']}  </td>
      </tr>
      {/foreach}
   </table>

</div>
    {/if}

</div>
