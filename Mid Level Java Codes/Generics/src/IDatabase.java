public interface IDatabase<Variable> {

    public void add(Variable T);
    public void update();

    void update(Variable T);

    public Variable list();
    public void select();

}
