public class AList {

    private Object[] arrayData;
    private int aListSize;


    public AList(int maxLength){
        arrayData = new Song[maxLength];
        aListSize = 0;
    }

    public void listAdd(Object p){
        if(arrayData.length == aListSize){
            resize(aListSize*2);
        }
        arrayData[aListSize] = p;
        ++aListSize;
    }

    public void listRemove(int pos){
        if(pos >= 0 && pos < aListSize){
            for(int i = pos; i < aListSize - 1; i++){
                arrayData[i] = arrayData[i+1];
            }
            --aListSize;
        }
    }

    public String toString(){
        String elements = "";
        for(int i = 0; i < aListSize; i++){
            elements += arrayData[i].toString();
        }
        return elements;
    }

    public void resize(int newSize){
        Object[] newA = new Object[newSize];

        for(int i = 0; i < aListSize; i++){
            newA[i] = arrayData[i];
        }
        arrayData = newA;
    }


}
