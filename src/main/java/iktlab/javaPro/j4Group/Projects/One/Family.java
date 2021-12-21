package iktlab.javaPro.j4Group.Projects.One;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human father;
    private Human mother;
    private Human[] children;
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
    }

    public Family(Human father, Human mother, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
        this.pet = pet;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child){
        Human newChildren[] = new Human[children.length + 1];
        for(int i=0; i < children.length; i++){
            newChildren[i] = children[i];
        }
        newChildren[children.length] = child;
        children = newChildren;
    }

    public boolean deleteChild(Human child){
        Human[] newChildren = new Human[children.length-1];
        int count = 0;
        for(int i =0, k = 0; i<children.length; i++){
            if(!child.equals(children[i])){
                newChildren[k++] = children[i];
            }
            else {
                count ++;
            }
            children = newChildren;
        }
        if(count > 0)
            return true;
        else return false;
    }

    public boolean deleteChild(int index){
        if(index<0){return false;}
        else{
            if(index>children.length-1){
                return false;
            }
            else{
                Human[] newChildren = new Human[children.length-1];
                for(int i =0, k = 0; i<children.length; i++){
                    if(i != index)
                        newChildren[k++] = children[i];
                }
                children = newChildren;
                return true;
            }
        }
    }

    public byte countFamily(){
        byte count = (byte) (children.length +2);
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getFather(), family.getFather())
                && Objects.equals(getMother(), family.getMother()) &&
                Arrays.equals(getChildren(), family.getChildren()) &&
                Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFather(), getMother(), getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }

    @Override
    public String toString() {
        return String.format("Mother = %s, \n Father = %s,  \n Children = %s,  \n pet = %s",
                mother, father, Arrays.toString(children), pet);
    }
}

