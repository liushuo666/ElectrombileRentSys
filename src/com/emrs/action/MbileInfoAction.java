/**
 * 
 */
package com.emrs.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emrs.entity.MbileInfo;
import com.emrs.service.MbileInfoService;

/**
 * @author Administrator
 *
 */
@Controller
public class MbileInfoAction {
	
	@Resource(name="mbileInfoService")
	private MbileInfoService mbileInfoService;
	
	@RequestMapping("queryMbileInfos")
	public String queryAllMbileInfos(){
		List<MbileInfo> mbileInfos = mbileInfoService.queryAllInfos();
		for (MbileInfo mbileInfo : mbileInfos) {
			System.out.println(mbileInfo.toString());
		}
		return "index";
	}
}
