
# FoodRandomizer 🍔🍟

> *Because choosing between Pizza and Sushi shouldn't require a degree in game theory.*

<div align="center">

![GitHub repo size](https://img.shields.io/github/repo-size/ankitmahendru/FoodRandomizer?color=orange&style=for-the-badge&logo=github)
![GitHub top language](https://img.shields.io/github/languages/top/ankitmahendru/FoodRandomizer?color=blueviolet&style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/ankitmahendru/FoodRandomizer?color=ff69b4&style=for-the-badge)

</div>

---

## 🧐 Introduction

Look, we’ve all been there. You’re hungry, your partner is hungry (or "hangry"), and the conversation goes like this:  
*"What do you want to eat?"* *"I don't know, what do you want?"* ...followed by 45 minutes of staring at a wall in existential despair.

**FoodRandomizer** is the over-engineered solution to your indecision. Built with **React**, this tool takes your list of potential cravings and uses a "sophisticated" randomization algorithm (okay, it’s just `Math.random()`) to decide your fate. It’s fast, it’s reactive, and it’s significantly better at making decisions than you are.

---

## ✨ Key Features

- **Dynamic Entry**: Add as many food options as your stomach can imagine.
- **Instant Randomization**: Get a result in milliseconds. No more scrolling through delivery apps for hours.
- **Modern UI**: A clean React-based interface that doesn't look like it was built in 1995.
- **Zero Configuration**: No database, no login, no "AI-powered recommendations"—just honest-to-goodness random luck.

---

## 📂 Project Structure

I've parsed the codebase for you. Here is the blueprint of this culinary decision-maker:

```bash
FoodRandomizer/
├── public/              # Static assets and the HTML shell
├── src/
│   ├── components/      # The UI building blocks
│   │   ├── FoodList.js  # Manages the list of your potential meals
│   │   └── Picker.js    # The "Button of Destiny"
│   ├── App.js           # The main logic hub
│   ├── App.css          # The paint that makes it look pretty
│   └── index.js         # The entry point where React wakes up
├── package.json         # The holy grail of dependencies
└── README.md            # You are here.

```

---

## 💿 Installation Guide

Want to run this local hero on your own machine? Follow these steps (and try not to break anything).

### Prerequisites

* **Node.js**: (LTS version recommended)
* **npm** or **yarn**

### Setup Steps

1. **Clone the Repo**:
```bash
git clone [https://github.com/ankitmahendru/FoodRandomizer.git](https://github.com/ankitmahendru/FoodRandomizer.git)
cd FoodRandomizer

```


2. **Install Dependencies**:
```bash
npm install

```


3. **Fire It Up**:
```bash
npm start

```


*Your browser should automatically open to `http://localhost:3000`.*

---

## 🎮 Usage

1. **Input**: Type a food item (e.g., "Tacos") into the input field.
2. **Add**: Hit enter or click 'Add' to put it in the pool.
3. **Repeat**: Add at least two options unless you just want an echo chamber.
4. **Randomize**: Click the button and accept your destiny.

---

## 🛠 Tech Stack

| Technology | Purpose |
| --- | --- |
| **React.js** | Creating a UI more responsive than my ex. |
| **JavaScript (ES6+)** | Logic, mapping, and the magic of `Math.random()`. |
| **CSS3** | Ensuring the buttons are actually clickable. |
| **Vercel/Netlify** | (Optional) For when you want to host your indecision online. |

---

## 🤝 Contribution Guide

Think you can make the randomizer even more random? PRs are welcome!

1. Fork the Project.
2. Create your Feature Branch (`git checkout -b feature/CoolNewStuff`).
3. Commit your changes (`git commit -m 'Added more spice'`).
4. Push to the Branch (`git push origin feature/CoolNewStuff`).
5. Open a Pull Request.

---

## 📄 Licensing

This project is licensed under the **MIT License**. Use it, change it, just don't blame me if you end up eating salad when you wanted a burger.

---

<div align="center">

**Made with love by PadhoAI** ❤️

</div>
