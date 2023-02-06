package medicamentos.dao;

//<T> nao vai receber de algum tipo especifico: generico. Decidir dps
public interface IDao <T>{

    public T saltar(T t);


}
