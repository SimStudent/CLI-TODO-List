package core;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import model.Task;
import model.TaskStatus;

public class TaskDataGenerator {
    
    public static List<Task> generateSampleTasks() {
        // 创建任务1
        Task task1 = new Task();
        task1.setId(1);
        task1.setPriority(1);
        task1.setTitle("完成项目报告");
        task1.setCategory("工作");
        task1.setDescription("完成季度项目进度报告并提交给经理");
        task1.setStatus(TaskStatus.IN_PROGRESS);
        task1.setStart(Instant.now().minusSeconds(3600));
        task1.setCreatedAt(Instant.now().minusSeconds(7200));
        task1.setUpdatedAt(Instant.now().minusSeconds(1800));
        task1.setTags(Arrays.asList("重要", "紧急", "文档"));
        
        // 创建任务2
        Task task2 = new Task();
        task2.setId(2);
        task2.setPriority(2);
        task2.setTitle("购买生活用品");
        task2.setCategory("个人");
        task2.setDescription("去超市购买食品和日用品");
        task2.setStatus(TaskStatus.TODO);
        task2.setCreatedAt(Instant.now().minusSeconds(86400));
        task2.setUpdatedAt(Instant.now().minusSeconds(43200));
        task2.setTags(Arrays.asList("购物", "生活"));
        
        // 创建任务3
        Task task3 = new Task();
        task3.setId(3);
        task3.setPriority(3);
        task3.setTitle("学习Java新特性");
        task3.setCategory("学习");
        task3.setDescription("学习Java 17的新特性并做笔记");
        task3.setStatus(TaskStatus.DONE);
        task3.setStart(Instant.now().minusSeconds(172800));
        task3.setEnd(Instant.now().minusSeconds(86400));
        task3.setCreatedAt(Instant.now().minusSeconds(259200));
        task3.setUpdatedAt(Instant.now().minusSeconds(86400));
        task3.setTags(Arrays.asList("学习", "Java", "技能"));
        
        // 创建任务4
        Task task4 = new Task();
        task4.setId(4);
        task4.setPriority(1);
        task4.setTitle("准备会议材料");
        task4.setCategory("工作");
        task4.setDescription("为下周的部门会议准备演示材料");
        task4.setStatus(TaskStatus.CANCELLED);
        task4.setCreatedAt(Instant.now().minusSeconds(129600));
        task4.setUpdatedAt(Instant.now().minusSeconds(86400));
        task4.setTags(Arrays.asList("会议", "工作", "演示"));
        
        // 创建任务5
        Task task5 = new Task();
        task5.setId(5);
        task5.setPriority(2);
        task5.setTitle("健身锻炼");
        task5.setCategory("健康");
        task5.setDescription("去健身房进行一周三次的常规锻炼");
        task5.setStatus(TaskStatus.IN_PROGRESS);
        task5.setStart(Instant.now());
        task5.setCreatedAt(Instant.now().minusSeconds(90000));
        task5.setUpdatedAt(Instant.now().minusSeconds(3600));
        task5.setTags(Arrays.asList("健身", "健康", "运动"));
        
        return Arrays.asList(task1, task2, task3, task4, task5);
    }
    
    public static void test() {
        List<Task> sampleTasks = generateSampleTasks();
        for (Task task : sampleTasks) {
            System.out.println(task);
        }
    }
}