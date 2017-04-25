/**
 * 
 */
package adp05;

/**
 * @author Daexel
 *
 */

public class  Container <T> {
private int key;
private T element;


public Container(int key){
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
  if ( o instanceof Container ){
	  if (this.key== ((Container) o).getKey()){
		  return true;
	  } 
  }
  return false;
}
}

