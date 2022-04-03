package lab.pkg7;
import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

  private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

  public ImageElement getFlyweight(String n) {
    // return a flyweight if it already exists, otherwise, put it in the map.
    String key=String.valueOf(n);
    if(flyweights.containsKey(key)){
         return flyweights.get(key);
    }
    else{
    ImageElement e=new ImageElement(n);
    flyweights.put(key, e);
    return e;
    }
  }

  public int numberOfFlyweights() {
    // return the size of the HashMap
      return flyweights.size();
  }

}

