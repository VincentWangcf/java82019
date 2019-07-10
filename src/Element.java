public class Element implements Comparable {



    int id;
    Element(int id){
        this.id= id;
    }
    @Override
    public int compareTo(Object o) {
        Element e =(Element)o;
        return this.id-e.id;
    }
    public String toString(){
        return ""+ this.id;
    }
}
