package twotter;

import java.io.Serializable;
import java.util.List;

public interface ObjectManager<T extends Serializable>
{
    public void serialize(List<T> object);
    public List<T> deserialize();
}
