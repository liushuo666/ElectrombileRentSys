/**
 * 
 */
package com.emrs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.emrs.entity.MbileInfo;

/**
 * @author Administrator
 *
 */
@Repository("mbileInfoDao")
public interface MbileInfoDao {
	public List<MbileInfo> queryAllInfos();
}
