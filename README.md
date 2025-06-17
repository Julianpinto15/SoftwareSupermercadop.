🛒 Sistema de Gestión Integral de Supermercado

Un sistema completo de gestión empresarial desarrollado en Spring Boot para la administración eficiente de supermercados y tiendas de retail.

🌟 Características Principales
📊 Gestión Completa de Inventario

Control en tiempo real de productos (Frutas, Verduras, Carnes)
Alertas automáticas de stock mínimo
Seguimiento de movimientos de inventario
Gestión de proveedores y compras

💰 Sistema de Ventas y Facturación

Punto de venta (POS) integrado
Facturación electrónica
Gestión de devoluciones
Reportes de ventas detallados

👥 Administración de Personal

Control de empleados y roles
Gestión de turnos de trabajo
Sistema de autenticación y autorización
Múltiples niveles de acceso

📈 Reportes y Contabilidad

Dashboard de métricas en tiempo real
Reportes financieros detallados
Análisis de rentabilidad por producto
Exportación de datos

🚀 Tecnologías Utilizadas

Backend: Spring Boot, Spring Security, Spring Data JPA
Frontend: Thymeleaf, HTML5, CSS3, JavaScript
Base de Datos: MySQL
Arquitectura: MVC (Model-View-Controller)
Seguridad: Autenticación basada en roles
Email: Integración para notificaciones

##📁 Estructura del Proyecto
mini-control-empleados/
├── 📂 controlador/          # Controladores REST y Web
├── 📂 entidades/           # Modelos JPA/Hibernate
├── 📂 repositorios/        # Repositorios de datos
├── 📂 servicio/           # Lógica de negocio
├── 📂 ServiceImpl/        # Implementaciones de servicios
├── 📂 resources/
│   ├── 📂 static/         # CSS, JS, Imágenes
│   └── 📂 templates/      # Plantillas Thymeleaf
└── 📂 BD/                 # Scripts de base de datos








⚡ Funcionalidades por Módulo
🥩 Gestión de Carnes
Registro de productos cárnicos
Control de fechas de vencimiento
Precios dinámicos por temporada

🍎 Frutería y Verdulería (Fruver)

Inventario de productos frescos
Control de calidad y rotación
Gestión de pérdidas por deterioro

🧾 Facturación Inteligente

Facturación electrónica DIAN
Múltiples métodos de pago
Integración con datafonos

📊 Business Intelligence

KPIs en tiempo real
Análisis de tendencias de venta
Predicción de demanda

🛠️ Instalación y Configuración
Prerrequisitos

Java 17 o superior
MySQL 8.0+
Maven 3.6+

Pasos de instalación

Clonar el repositorio
bashgit clone https://github.com/tu-usuario/sistema-supermercado.git
cd sistema-supermercado

Configurar base de datos

Crear base de datos MySQL
Ejecutar scripts en carpeta BD/
Configurar application.properties


Ejecutar la aplicación
bashmvn spring-boot:run

Acceder al sistema

URL: http://localhost:8080
Usuario admin por defecto



🎯 Casos de Uso
✅ Pequeños supermercados
✅ Tiendas de barrio
✅ Fruterías especializadas
✅ Minimercados
✅ Tiendas de conveniencia
