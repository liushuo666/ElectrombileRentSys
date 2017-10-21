/**
 * 
 */
package com.emrs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.emrs.dao.MbileInfoDao;
import com.emrs.entity.MbileInfo;
import com.emrs.service.MbileInfoService;

/**
 * @author Administrator
 *
 */
@Service("mbileInfoService")
public class MbileInfoServiceImpl implements MbileInfoService {
	
	/* (non-Javadoc)
	 * @see com.emrs.service.MbileInfoService#queryAllInfos()
	 */
	@Resource(name="mbileInfoDao")
	private MbileInfoDao mbileInfoDao;
	@Override
	public List<MbileInfo> queryAllInfos() {
		return mbileInfoDao.queryAllInfos();
	}

}
