package java.infrastructure.repository;

/**
 * 
 * @author brucejiang.jgf
 * @version 1.0
 * @Date Nov 27, 2012
 * @description
 *
 */
public abstract class EntityBase<T> implements IEntity {
	private T _id;

	//TODO:�������Ͻ������������id���ж�
	@Override
	public boolean equals(Object obj){
		return super.equals(obj);
	} 
	
	//TODO:�������Ͻ������������id���ж�
	@Override
	public int hashCode(){
		return super.hashCode();
	}
	
	public T get_id() {
		return _id;
	}


	public void set_id(T _id) {
		this._id = _id;
	}
	
	
}
