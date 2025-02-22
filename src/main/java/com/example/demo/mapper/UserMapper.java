package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public class UserMapper implements BaseMapper<User> {
    @Override
    public int insert(User entity) {
        return 0;
    }

    @Override
    public int deleteById(Serializable id) {
        return 0;
    }

    @Override
    public int deleteById(User entity) {
        return 0;
    }

    @Override
    public int deleteByMap(Map<String, Object> columnMap) {
        return 0;
    }

    @Override
    public int delete(Wrapper<User> queryWrapper) {
        return 0;
    }

    @Override
    public int deleteBatchIds(Collection<?> idList) {
        return 0;
    }

    @Override
    public int updateById(User entity) {
        return 0;
    }

    @Override
    public int update(User entity, Wrapper<User> updateWrapper) {
        return 0;
    }

    @Override
    public User selectById(Serializable id) {
        return null;
    }

    @Override
    public List<User> selectBatchIds(Collection<? extends Serializable> idList) {
        return Collections.emptyList();
    }

    @Override
    public List<User> selectByMap(Map<String, Object> columnMap) {
        return Collections.emptyList();
    }

    @Override
    public Long selectCount(Wrapper<User> queryWrapper) {
        return 0L;
    }

    @Override
    public List<User> selectList(Wrapper<User> queryWrapper) {
        return Collections.emptyList();
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<User> queryWrapper) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> selectObjs(Wrapper<User> queryWrapper) {
        return Collections.emptyList();
    }

    @Override
    public <P extends IPage<User>> P selectPage(P page, Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <P extends IPage<Map<String, Object>>> P selectMapsPage(P page, Wrapper<User> queryWrapper) {
        return null;
    }
}
