<div class="cuerpo">
   <div >
      <h1>Air Sonia</h1>
      <h2>“Donde tu viaje comienza... ”</h2>
   </div>

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
         </tr>
         {/if}
         {/foreach}
      </table>
      {/foreach}
   </div>

</div>
