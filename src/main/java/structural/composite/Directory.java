package structural.composite;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

public class Directory implements Component{

    private String name;
    private List<Component> children = null;
    private Component parent = null;

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addChild(Component component) {
        if(children == null){
            children = Lists.newLinkedList();
        }

        children.add(component);
        component.setParent(this);
    }

    @Override
    public void removeChild(Component component) {
        if(hasChild(component)){
            children.remove(component);
        }
    }

    @Override
    public List<Component> getChildren() {
        if(children != null){
            return children;
        }else {
            return Collections.emptyList();
        }
    }

    @Override
    public void setParent(Component component) {
        this.parent = component;
    }

    @Override
    public Component getParent() {
        return parent;
    }

    private boolean hasChild(Component component){
        if(children != null && children.contains(component)){
            return true;
        }else return false;
    }
}
