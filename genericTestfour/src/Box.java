class Box<T,S> {
    private T t;
    private S s;

    public void add(T t,S s){
        this.t=t;
        this.s=s;
    }
    public T firstget(){
        return t;
    }
    public S secondget(){
        return s;
    }
}
