package com.mvn.mapper;

import com.mvn.entity.Department;
import com.mvn.entity.Employee;

import java.util.List;

public interface EmployeeMapper {

		// 查询员工信息
		List<Employee> queryAll();

		// 查询部门信息
		List<Department> queryAlld();

		// 添加
		int addEmpy(Employee employee);

		// 删除
		void delEmpy(int id);

		// 修改先根据id查询回显数据
		Employee getEmpyId(int id);

		// 修改
		void updateEmpy(Employee employee);
}
