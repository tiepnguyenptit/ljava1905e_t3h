package application.data.repository;

import application.data.model.Category;
import application.model.viewmodel.common.ChartDataVM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @Query("select count(c.id) from dbo_category c")
    long getTotalCategories();

    @Query("SELECT new application.model.viewmodel.common.ChartDataVM(c.name, count(c.id)) " +
            "FROM dbo_category c " +
            "INNER JOIN c.listProducts p " +
            "GROUP BY c.id")
    List<ChartDataVM> getChartDataVMCategoryProduct();


}
