package org.pguide.mms.manage.service;

import java.util.List;
import org.pguide.mms.manage.domain.MmsProjectMemberInfo;

/**
 * 项目成员信息表Service接口
 * 
 * @author dkwms
 * @date 2024-01-16
 */
public interface IMmsProjectMemberInfoService 
{
    /**
     * 查询项目成员信息表
     * 
     * @param projectId 项目成员信息表主键
     * @return 项目成员信息表
     */
    public MmsProjectMemberInfo selectMmsProjectMemberInfoByProjectId(Long projectId);

    /**
     * 查询项目成员信息表列表
     * 
     * @param mmsProjectMemberInfo 项目成员信息表
     * @return 项目成员信息表集合
     */
    public List<MmsProjectMemberInfo> selectMmsProjectMemberInfoList(MmsProjectMemberInfo mmsProjectMemberInfo);

    /**
     * 新增项目成员信息表
     * 
     * @param mmsProjectMemberInfo 项目成员信息表
     * @return 结果
     */
    public int insertMmsProjectMemberInfo(MmsProjectMemberInfo mmsProjectMemberInfo);

    /**
     * 修改项目成员信息表
     * 
     * @param mmsProjectMemberInfo 项目成员信息表
     * @return 结果
     */
    public int updateMmsProjectMemberInfo(MmsProjectMemberInfo mmsProjectMemberInfo);

    /**
     * 批量删除项目成员信息表
     * 
     * @param projectIds 需要删除的项目成员信息表主键集合
     * @return 结果
     */
    public int deleteMmsProjectMemberInfoByProjectIds(Long[] projectIds);

    /**
     * 删除项目成员信息表信息
     * 
     * @param projectId 项目成员信息表主键
     * @return 结果
     */
    public int deleteMmsProjectMemberInfoByProjectId(Long projectId);
}
