package zestaw8.src;

public class RiakCommands {
    public static final String CREATE_COMMAND = "curl -i -X PUT -H \"Content_Type:application/json\" -d '{\"manufacturer\":\"Chevrolet\",\"model\":\"Camaro\",\"manufacturedIn\":1969,\"running\":true,}' http://localhost:8098/buckets/s22949/keys/Camaro?returnbody=true";
    public static final String GET_COMMAND = "curl -i http://localhost:8098/buckets/s22949/keys/Camaro";
    public static final String MODIFY_COMMAND = "curl -i -X PUT -H \"Content_Type:application/json\" -d '{\"manufacturer\":\"Chevrolet\",\"model\":\"Camaro\",\"manufacturedIn\":1969,\"running\":true,\"color:\"sea-blue\"}' http://localhost:8098/buckets/s22949/keys/Camaro?returnbody=true";
    public static final String DELETE_COMMAND = "curl  -i -X DELETE http://localhost:8098/buckets/s22949/keys/Camaro";
}
