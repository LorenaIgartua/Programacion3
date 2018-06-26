<div class="cuerpo">
   <h1>Servicio 3</h1>

   {if !empty($error) }

   <div class="alert alert-danger row" role="alert">{$error}</div>
   {/if}
	{include file="filtro_servicio_3.tpl"}
	{if !empty($fecha) }
	<h2> la ocupacion al {$fecha} es </h2>

   <div class="departamentos col-lg-12 col-md-12 col-sm-12 col-xs-12">
      {foreach from=$ciudades item=ciudad}
      <h3>{$ciudad['nombre']}</h3>
      <table class="table table-responsive" id = "{$ciudades['nombre']}" >
        {foreach from=$departamentos item=departamento}
         {if ($departamento['id_ciudad']==$ciudad['id_ciudad'])}
         <tr>
            <td id="descripcion" class = "celda_descripcion" >{$departamento['descripcion']}  </td>
			<td id="descripcion" class = "celda_precio" >{$departamento['superficie']}  Mts2</td>
			<td id="descripcion" class = "celda_precio" >$ {$departamento['precio_noche']}  </td>
			<td id="descripcion" class = "celda_precio" > {$departamento['estado']}  </td>
         </tr>
         {/if}
         {/foreach}
      </table>
      {/foreach}
   </div>
{/if}
</div>
