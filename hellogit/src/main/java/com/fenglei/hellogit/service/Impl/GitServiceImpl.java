package com.fenglei.hellogit.service.Impl;

import com.fenglei.hellogit.bean.TbContent;
import com.fenglei.hellogit.mapper.GitMapper;
import com.fenglei.hellogit.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GitServiceImpl implements GitService {

    @Autowired
    private GitMapper gitMapper;
    @Override
    public List<TbContent> getTbContentList() {
        List<TbContent> tbContents = gitMapper.getTbContentList();
        return tbContents;
    }
}
