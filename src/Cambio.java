import com.google.gson.annotations.SerializedName;

public record Cambio(String base_code,
                     String target_code,
                     double conversion_rate,
                     double conversion_result)
{
    public record Conversion(
            @SerializedName("base_code") String codigoBase,
            @SerializedName("target_code") String codigoObjetivo,
            @SerializedName("conversion_rate") double tasaConversion,
            @SerializedName("conversion_result") double resultadoConversion1){}
}
