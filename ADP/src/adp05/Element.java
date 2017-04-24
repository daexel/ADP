/**
 * 
 */
package adp05;

/**
 * @author Daexel
 *
 */

public class Element {
private int key;

public Element(int key){
	this.key=key;
}

public int getKey(){
	return this.key;
}
@Override
public boolean equals( Object o ){
  if ( o == null ){
    return false;
  }
  if ( o instanceof Element ){
	  if (this.key== ((Element) o).getKey()){
		  return true;
	  } 
  }
  return false;
}
}

