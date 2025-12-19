# Loot2D

A 2D tile-based adventure game engine built from scratch using Java and the Swing framework. 

## 🚀 Project Overview
Loot2D is a passion project developed to explore the fundamentals of game development and software architecture. Transitioning from a foundational tutorial to a fully custom experience, this project serves as a sandbox for implementing core software engineering principles in a real-time environment.

### 🛠 Technical Highlights
- **Framework:** Developed using **Java Swing** and **AWT** for custom graphics rendering.
- **Architecture:** Implements a modular design, separating application entry (`Main`) from the core game logic and rendering surface (`GamePanel`).
- **Encapsulation:** Utilizing class-level constants and private access modifiers to manage screen settings and tile-based coordinate systems (16x16 base).
- **In-Progress:** Currently architecting the **Multi-threaded Game Loop** to handle synchronized physics updates and 60FPS rendering.

## 🏗 Current Progress
- [x] Initial JFrame Window Setup
- [x] Custom JPanel (GamePanel) extension
- [x] Screen coordinate and tile-size configuration
- [ ] Implementation of the `Runnable` interface for the Game Loop
- [ ] Keyboard input handling via `KeyListener`
- [ ] Custom 16-bit sprite integration

## 📂 Project Structure
- `Main.java`: The entry point of the application; handles window initialization and display settings.
- `GamePanel.java`: The primary rendering surface; responsible for managing game states and the refresh cycle.

## ⚙️ Requirements
- **Java Development Kit (JDK) 17 or higher**
- An IDE such as **IntelliJ IDEA** or Eclipse
