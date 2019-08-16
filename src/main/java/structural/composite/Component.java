package structural.composite;

import java.util.Collections;
import java.util.List;

public interface Component {

    String getName();

    default void addChild(Component component){
        throw new UnsupportedOperationException("unsupported add child");
    }
    default void removeChild(Component component){
        throw new UnsupportedOperationException("unsupported remove child");
    }
    default List<Component> getChildren(){
        return Collections.emptyList();
    }

    void setParent(Component component);
    Component getParent();
}
