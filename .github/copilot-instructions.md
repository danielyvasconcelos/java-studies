# Copilot Instructions for `java-studies`

## Overview

This repository is a structured, modular Java learning journey, organized into progressive modules from fundamentals to advanced topics and practical projects. Each module is a self-contained learning unit with its own `README.md`, examples, exercises, and (optionally) a mini-project.

## Repository Structure & Navigation

- **Modules:** Each folder `01-fundamentos`, `02-poo`, ..., `10-projetos-praticos` is a module. Each module contains:
  - `README.md`: Module goals and main concepts
  - `exemplos/`: Example code
  - `exercicios/`: Solved exercises
  - `anotacoes.md`: Summaries and insights
  - `projeto-mini/`: Mini-project (optional)
- **Top-level `README.md`:** Explains the overall roadmap, semantic commit conventions, and navigation tips.
- **Source code:** Java source files are under `src/` in each module, following package conventions (e.g., `deitel/`).
- **Compiled code:** Output is typically in a parallel `bin/` structure, mirroring the source tree.

## Developer Workflows

- **Build/Run:**
  - Use your preferred IDE (IntelliJ, Eclipse, VS Code) for compiling and running Java files.
  - For CLI: `javac -d bin src/Deitel/Welcome.java` then `java -cp bin deitel.Welcome` (adjust paths as needed).
- **Testing:**
  - JUnit 5 and Mockito are used for tests (see `08-frameworks/junit-testing/`).
  - No global test runner; tests are organized per module.
- **Versioning:**
  - Use semantic commit messages: `feat:`, `docs:`, `refactor:`, `fix:`, `study:`
  - Branching: `main` (stable), `feature/topico`, `exercise/nome`

## Project-Specific Patterns & Conventions

- **Naming:**
  - Classes: PascalCase, e.g., `Welcome`, `SomandoInteiros`
  - Packages: lowercase, e.g., `deitel`
- **Documentation:**
  - Each module and most exercises/examples are documented in Markdown.
- **Learning Focus:**
  - Code is often didactic, prioritizing clarity and concept demonstration over production robustness.
- **No central build tool:**
  - Some modules may use Maven/Gradle (see `08-frameworks/maven-gradle/`), but most are plain Java.

## Integration & External Dependencies

- **Frameworks:**
  - Spring, Hibernate, and others are explored in `08-frameworks/`
- **No cross-module runtime dependencies:**
  - Each module is self-contained for learning purposes.

## Examples

- To add a new exercise in `04-collections`, place it in `04-collections/src/collections/exercicios/` and document it in the module's `README.md`.
- To run a design pattern example: compile from `07-design-patterns/src/behavioral/observer/` and run the corresponding class.

---

For more, see the top-level `README.md` and each module's `README.md` for specifics.
