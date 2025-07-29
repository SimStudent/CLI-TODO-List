# CLI TODO List

[🇺🇸 English Documentation](./README.md)

一个基于 Java 编写的命令行待办事项管理工具，目标是实现轻量、模块化、可扩展的任务管理功能。支持通过命令行快速添加、查看、编辑、完成与删除任务，并支持将程序打包为 `.exe` 文件独立运行。

---

## 项目特点

- 使用 Java Collections Framework 构建核心数据结构
- 基于面向对象思想设计 Task 模型，支持优先级、分类、标签、时间戳等字段
- 命令驱动式架构，用户可通过命令快速操作任务
- 具备清晰的模块划分（模型层、任务管理层、命令解析层等）
- 支持未来扩展功能：子任务系统、标签搜索、持久化存储、输出格式定制等
- 项目以 CLI 工具为核心目标，类 Unix 工具风格，追求语义化命令体验

---

## 当前已实现功能（基础版本）

- 添加任务
- 列出所有任务
- 根据任务 ID 删除任务
- 根据任务 ID 完成任务
- 查询指定任务详情
- 编辑任务信息
- 命令行帮助系统（`help` 命令）

---

## 命令用法示例

```bash
# 查看可用命令
todo help

# 添加任务
todo add --title "写 README" --priority 2 --category "文档" --description "为项目写一份结构清晰的说明文档"

# 列出任务
todo list

# 查看指定任务
todo show --id 3

# 编辑任务
todo edit --id 3 --title "写 README.md" --priority 1

# 删除任务
todo delete --id 3

# 完成任务
todo complete --id 3
```

---

## 编译与运行

1. 克隆本项目：

```bash
git clone https://github.com/yourname/todo-cli.git
cd todo-cli
```

2. 编译项目：

```bash
javac -d out src/**/*.java
```

3. 运行命令：

```bash
java -cp out Main add --title "学习 Java"
```

4. 打包为 `.exe`（可选）：

可使用 [Launch4j](http://launch4j.sourceforge.net/) 或 [jpackage](https://docs.oracle.com/en/java/javase/14/jpackage/packaging-overview.html) 工具将 `.jar` 转换为 `.exe`。

---

## 项目结构（建议）

```
src/
├── model/              # Task、TaskStatus 等实体类
├── manager/            # TaskManager，负责任务的增删改查逻辑
├── command/            # 各种命令的解析与调度（如 AddCommand、HelpCommand）
├── parser/             # 命令行参数解析器
├── cli/                # CLI 主程序入口与调度
└── util/               # 时间工具、格式化工具等
```

---

## 设计思路与扩展性说明

- 模型层 `Task` 类已预留扩展能力，未来可引入子任务（通过添加 `List<Task> subtasks` 字段或建立父子映射）
- 所有功能按模块划分，便于未来加入命令别名、自定义输出格式、配置文件、网络同步等功能
- 命令系统采用“单次指令执行后退出”的机制，每次运行程序只响应一条命令，更符合 CLI 工具风格（如 `scoop`, `git`）
- 提交历史保持原子性，每一次提交只包含一项独立功能变更，方便版本追踪与回滚

---

## 开发与协作建议

- 主分支为 `main`，仅存放稳定发布版本
- 开发应在 `dev` 分支进行，功能模块可采用 `feature/xxx` 命名分支开发
- 每次提交请遵循规范化的 commit message 格式，例如：
  - `feat: 添加命令解析器框架`
  - `fix: 修复删除任务时报空指针的问题`
  - `docs: 完善命令帮助信息`

---

## License

MIT License. 自由使用与修改。

---

## 致谢

本项目用于学习 Java Collections、命令行工具设计以及面向对象架构。灵感参考诸如 `scoop`, `git`, `npm` 等命令行工具的交互风格。
