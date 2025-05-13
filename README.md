# Challenge-Conversor-de-Moneda
# 💰 Conversor de Monedas  

## 📌 Descripción  
Este proyecto es un **conversor de monedas interactivo** desarrollado en Java, que permite a los usuarios convertir valores entre distintas monedas utilizando una API de tasas de cambio en tiempo real.  

Además, almacena un **historial de conversiones** de forma persistente en un archivo `.txt`, permitiendo a los usuarios visualizar conversiones previas en cada ejecución.  

## ⚙️ Tecnologías utilizadas  
- **Java 17**  
- **IntelliJ IDEA**  
- **HttpClient** para solicitudes API  
- **Gson** para manejo de JSON  
- **java.time** para marcas de tiempo  
- **Archivos `.txt`** para almacenamiento persistente  

## 🚀 Funcionalidades  
✔ Conversión de monedas en tiempo real.  
✔ Historial de conversiones con fecha y hora.  
✔ Persistencia del historial en un archivo `.txt`.  
✔ Menú interactivo para selección de monedas.  
✔ Validaciones de entrada para evitar errores.  

## 🏗 Estructura del proyecto  
Challenge Conversor de Monedas/ │── src/ │   │── ConversorMoneda.java │   │── HistorialConversiones.java │   │── ExchangeRateInteractive.java │   │── ExchangeRateJsonParser.java │── gson-2.10.1.jar │── historial_conversiones.txt │── README.md
✔ `ConversorMoneda.java` → Clase principal del conversor.  
✔ `HistorialConversiones.java` → Maneja y almacena el historial de conversiones.  
✔ `ExchangeRateInteractive.java` → Manejo interactivo de tasas de cambio.  
✔ `ExchangeRateJsonParser.java` → Análisis de respuestas API.  

## 🔧 Instalación y ejecución  
### 1️⃣ Clonar el repositorio  
```bash
git clone https://github.com/usuario/conversor-moneda.git
```
2️⃣ Importar en IntelliJ IDEA
- Abrir IntelliJ IDEA → File > Open → Seleccionar la carpeta del proyecto.
- Agregar dependencias (como gson-2.10.1.jar si es necesario).

3️⃣ Ejecutar el programa
- Asegurar que ConversorMoneda.java es la clase principal.
- Presionar Run.
- ¡Listo para convertir monedas! 💰🚀

📜 Ejemplo de uso
🌍 Bienvenido/a al Conversor de Moneda 🌍
Seleccione la moneda base:
1. USD (Dólar estadounidense)
2. EUR (Euro)
...
Elija una opción válida: 1
Ingrese la cantidad en USD: 200
Resultado: 200 USD = 180 EUR
¿Desea realizar otra conversión? (Sí/No): sí


📜 Historial de conversiones guardado
[07/05/2025 23:57:12] 200 USD → 180 EUR
[07/05/2025 23:58:30] 100 CLP → 0.11 USD


🤝 Contribuciones
¡Se aceptan contribuciones! Si deseas mejorar el proyecto, crea un Pull Request o abre un Issue en el repositorio.
📄 Licencia
Este proyecto está bajo la MIT License, por lo que puedes usarlo libremente.

🎉 ¡Gracias por usar el conversor de monedas! 🚀💰✨
