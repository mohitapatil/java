package W1.d1;

public enum EnumConstructor {
    CO1(1,"one"),CO2(2,"two"),CO3(3,"three");

    private int a;
    private String s;

    EnumConstructor(int a, String s){
        this.a=a;
        this.s=s;
    }

    public int getInt(){
        return a;
    }

    public String geString(){
        return s;
    }

    public static void main(String args[]) {

        EnumConstructor[] enums = EnumConstructor.values();
     
        for(EnumConstructor oneEnum : enums){
            System.out.println("name "+ oneEnum.name() + " int " + oneEnum.getInt() + " string " + oneEnum.geString());        }
     
      }
}
