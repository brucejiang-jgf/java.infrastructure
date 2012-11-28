package java.infrastructure.repository;

import java.util.Collection;

/**
 * 领域设计：仓储接口基类
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
	 * 新增实体
	 * @param item
	 */
	void Add(TEntity item);
	
	/**
	 * 删除实体
	 * @param item
	 */
    void Remove(TEntity item);
    
    /**
     * 更新实体
     * @param item
     */
    void Update(TEntity item);
    
    /**
     * 添加或更新实体
     * @param item
     */
    void SaveOrUpdate(TEntity item);
    
    /**
     * 根据key获取实体
     * @param key
     * @return
     */
    TEntity FindBy(TKey key);
    
    /**
     * 获取所有实体
     * @return
     */
    Collection<TEntity> FindAll();
    
    /**
     * 根据多个键值keys，获取相应的多个实体
     * @param keys
     * @return
     */
    Collection<TEntity> FindBy(TKey... keys);
}
