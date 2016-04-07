package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public abstract class JrPlayer implements PlayerInterface{

    @Override
    public LevelInterface levelInterface() {
        return new Junior();
    }

    @Override
    public abstract double subscription();
}
