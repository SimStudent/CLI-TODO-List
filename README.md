# CLI TODO List

[🇨🇳 中文文档](./README.zh-CN.md)

A command-line todo list management tool written in Java, aiming to provide lightweight, modular, and extensible task management features. Supports quick adding, viewing, editing, completing, and deleting tasks via the command line, and also supports packaging the program into a standalone `.exe` file.

---

## Project Features

- Core data structures built using the Java Collections Framework
- Task model designed with object-oriented principles, supporting fields such as priority, category, tags, and timestamps
- Command-driven architecture allowing users to operate tasks quickly via commands
- Clear modular separation (model layer, task management layer, command parsing layer, etc.)
- Supports future extensions: subtask system, tag search, persistent storage, customizable output formats, and more
- CLI tool as the core goal, Unix-like tool style, aiming for semantic command experience

---

## Currently Implemented Features (Basic Version)

- Add tasks
- List all tasks
- Delete tasks by task ID
- Complete tasks by task ID
- Query task details by ID
- Edit task information
- Command line help system (`help` command)

---

## Command Usage Examples

```bash
# View available commands
todo help

# Add a task
todo add --title "Write README" --priority 2 --category "Documentation" --description "Write a clear and structured README for the project"

# List tasks
todo list

# Show a specific task
todo show --id 3

# Edit a task
todo edit --id 3 --title "Write README.md" --priority 1

# Delete a task
todo delete --id 3

# Complete a task
todo complete --id 3
```

---

## Compile and Run

1. Clone the project:

```bash
git clone https://github.com/yourname/todo-cli.git
cd todo-cli
```

2. Compile the project:

```bash
javac -d out src/**/*.java
```

3. Run a command:

```bash
java -cp out Main add --title "Learn Java"
```

4. Package as `.exe` (optional):

You can use tools like [Launch4j](http://launch4j.sourceforge.net/) or [jpackage](https://docs.oracle.com/en/java/javase/14/jpackage/packaging-overview.html) to convert the `.jar` into an `.exe`.

---

## Project Structure (Suggested)

```
src/
├── model/              # Entity classes like Task, TaskStatus, etc.
├── manager/            # TaskManager, responsible for task CRUD logic
├── command/            # Parsing and dispatching various commands (e.g., AddCommand, HelpCommand)
├── parser/             # Command line argument parser
├── cli/                # CLI main program entry and dispatching
└── util/               # Time utilities, formatting utilities, etc.
```

---

## Design Concepts and Extensibility Notes

- The model layer’s `Task` class is designed with future extensibility in mind, such as adding subtasks (e.g., via a `List<Task> subtasks` field or parent-child mapping)
- All features are modularized, making it easy to add command aliases, custom output formats, configuration files, network sync, and more later
- The command system follows a “single-command execution then exit” pattern; the program responds to one command per run, aligning with CLI tool conventions (like `scoop`, `git`)
- Commit history maintains atomicity, each commit contains a single independent feature change for easier version tracking and rollback

---

## Development and Collaboration Suggestions

- The main branch is `main`, containing only stable release versions
- Development should be done on the `dev` branch, with feature branches named like `feature/xxx` for individual modules
- Commit messages should follow a standardized format, for example:

  - `feat: add command parser framework`
  - `fix: fix null pointer issue when deleting tasks`
  - `docs: improve command help information`

---

## License

MIT License. Free to use and modify.

---

## Acknowledgments

This project is intended for learning Java Collections, CLI tool design, and object-oriented architecture. Inspiration is drawn from CLI tools like `scoop`, `git`, and `npm`.
