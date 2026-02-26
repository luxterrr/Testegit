package treinoteste;

public enum ENUMS {
    /*MANHA("manha"),TARDE("tarde"),NOITE("noite");

    private String periodo;

    ENUMS(String periodo){
        this.periodo = periodo;
    }

    public String getPeriodo(){
        return this.periodo;
    }
    */


    COMPRA(1), VENDA (2), ESTOQUE ( 3);

    private Integer code;
        ENUMS(Integer code){
            this.code=code;
        }

        public Integer getCode(){
            return this.code;
        }
}
