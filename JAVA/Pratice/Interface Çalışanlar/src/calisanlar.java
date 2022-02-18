
public  abstract class calisanlar implements Comparable{
    
    private String name;
    private String meslek;
    private int age;
    private boolean suc;
    
    public calisanlar(){
        
    }

    public calisanlar(String name, String meslek, int age,boolean suc) {
        this.name = name;
        this.meslek = meslek;
        this.age = age;
        this.suc = suc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public void merhaba(){
        
        System.out.println(name+"den"+" "+"Selamlar...");
        
    }

    public boolean isSuc() {
        return suc;
    }

    public void setSuc(boolean suc) {
        this.suc = suc;
    }
    
    
    public abstract void çalış();
     
    public abstract int emeklilik();
    
    public abstract void sicil();
    
    
}
