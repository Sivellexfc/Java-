public class DatabaseManager<Variable> implements IDatabase<Variable> {

    public Variable variable;

    public DatabaseManager(Variable var){
        this.variable = var;
    }

    @Override
    public void add(Variable T) {
        System.out.println(T + " Eklendi");
    }

    @Override
    public void update() {

    }

    @Override
    public void update(Variable T) {
        System.out.println(T + " Güncellendi");
    }

    @Override
    public Variable list() {

        return this.variable;
    }

    @Override
    public void select() {
        System.out.println(this.variable);
    }
}
