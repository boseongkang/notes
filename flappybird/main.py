import pygame

import configs

pygame.init()

scree = pygame.display.set_mode(configs.SCREEN_WIDTH, configs.SCREEN_HEIGHT)
clock = pygame.time.Clock()
running = True

while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        screen.fill("pink")

        pygame.display.flip()
        clock.tick(configs.FPS)
pygame.quit()