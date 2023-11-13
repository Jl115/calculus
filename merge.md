# Calculus Merge Guide

## Einführung
Diese Anleitung beschreibt, wie Sie Änderungen im `dev-merge-branch` unseres Projekts mit IntelliJ IDEA integrieren können. Bitte folgen Sie diesen Schritten, um einen reibungslosen Merge-Prozess zu gewährleisten.

## Vorbereitung
Aktualisieren Sie zuerst Ihren `dev-merge-branch`, um sicherzustellen, dass Sie mit der neuesten Version arbeiten.

1. Öffnen Sie Ihr Projekt in IntelliJ IDEA.
2. Wechseln Sie zum `Version Control`-Tab (normalerweise unten in der IDE).
3. Wählen Sie `Git` → `Branches...` im unteren rechten Bereich des Fensters.
4. Unter `Remote Branches` finden und wählen Sie `dev-merge-branch`.
5. Klicken Sie auf `Checkout as new local branch`.

## Schritte zum Mergen von Änderungen

1. **Erstellen Sie einen neuen Feature-Branch**:
    - Wiederholen Sie die Schritte im `Version Control`-Tab, um einen neuen Branch zu erstellen, der von `dev-merge-branch` abzweigt.
    - Wählen Sie `New Branch from Selected...` und geben Sie einen Namen für Ihren Branch an, z.B. `feature-branch-name`.

2. **Entwickeln Sie Ihre Features**:
    - Implementieren Sie Ihre Änderungen im Code. Verwenden Sie die integrierten Tools von IntelliJ IDEA für die Entwicklung.

3. **Commiten Sie Ihre Änderungen**:
    - Öffnen Sie das `Commit`-Fenster (über `VCS` → `Commit`).
    - Wählen Sie die Dateien aus, die Sie commiten möchten, geben Sie eine Commit-Nachricht ein und klicken Sie auf `Commit`.

4. **Aktualisieren Sie Ihren Branch**:
    - Bevor Sie Ihren Branch zurück in den `dev-merge-branch` mergen, stellen Sie sicher, dass er die neuesten Änderungen enthält.
    - Wechseln Sie zurück zu `dev-merge-branch`, holen Sie die neuesten Änderungen (`Git` → `Pull`) und wechseln Sie dann zurück zu Ihrem `feature-branch-name`.
    - Führen Sie einen Merge durch (`Git` → `Merge Changes...`).

5. **Lösen Sie Merge-Konflikte**:
    - Falls Merge-Konflikte auftreten, lösen Sie diese mit dem integrierten Konfliktlösungstool von IntelliJ IDEA.

6. **Pushen Sie den Feature-Branch**:
    - Pushen Sie Ihren Branch zum Remote-Repository (`VCS` → `Git` → `Push`).

7. **Erstellen Sie einen Pull Request**:
    - Nutzen Sie die Weboberfläche Ihres Git-Repositories, um einen Pull Request von Ihrem `feature-branch-name` zum `dev-merge-branch` zu erstellen und um Code-Reviews zu bitten.

8. **Mergen Sie den Pull Request**:
    - Nach der Genehmigung können Sie den Pull Request in den `dev-merge-branch` mergen.

