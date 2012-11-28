package java.infrastructure.repository;

import java.util.Collection;

/**
 * ������ƣ��ִ��ӿڻ���
 * @author brucejiang.jgf
 * @version 1.0
 * @Date Nov 27, 2012
 * @description
 *
 * @param <TKey>
 * @param <TEntity>
 */
public interface IRepository<TKey extends Comparable<TKey>,TEntity extends IAggregateRoot> {
	/**
	 * ����ʵ��
	 * @param item
	 */
	void Add(TEntity item);
	
	/**
	 * ɾ��ʵ��
	 * @param item
	 */
    void Remove(TEntity item);
    
    /**
     * ����ʵ��
     * @param item
     */
    void Update(TEntity item);
    
    /**
     * ��ӻ����ʵ��
     * @param item
     */
    void SaveOrUpdate(TEntity item);
    
    /**
     * ����key��ȡʵ��
     * @param key
     * @return
     */
    TEntity FindBy(TKey key);
    
    /**
     * ��ȡ����ʵ��
     * @return
     */
    Collection<TEntity> FindAll();
    
    /**
     * ���ݶ����ֵkeys����ȡ��Ӧ�Ķ��ʵ��
     * @param keys
     * @return
     */
    Collection<TEntity> FindBy(TKey... keys);
}
