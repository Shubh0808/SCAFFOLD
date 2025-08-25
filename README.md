# 🔐 Secure App (Java + Semgrep + JaCoCo)

![Java CI with Coverage + Semgrep](https://github.com/Shubh0808/SCAFFOLD/actions/workflows/ci.yml/badge.svg)

---

## 📌 Project Overview
This project demonstrates **DevSecOps in action** with Java:
- ✅ Unit testing with **JUnit 5**
- ✅ Code coverage with **JaCoCo** (fails if <80%)
- ✅ Static analysis with **Semgrep**
- ✅ GitHub Actions pipeline enforcing coverage & security rules
- ✅ Live feedback inside VS Code with Semgrep extension

---

## ⚙️ How It Works
1. **Developer workflow**
   - Code in VS Code
   - Semgrep highlights issues instantly

2. **CI/CD pipeline**
   - Build + tests + coverage
   - Run Semgrep scan
   - Fail if:
     - Code coverage < 80%
     - Security Pass % < 70%

3. **Artifacts**
   - `target/site/jacoco/index.html` → coverage report
   - Semgrep findings in Actions logs
