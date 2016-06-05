while (h) {
                            
                            for (b = 0; b < gavetas.length; b++) {
                                for (l = 0; l < gavetas[b].length; l++) {
                                    if (i + (g - j.clas) <= 0 && i + (g - j.clas) < g) {
                                        if (gavetas[i + g - j.clas][l] != null) {
                                            gavetas[i + g - j.clas][i] = new Jogo();
                                            gavetas[i + g - j.clas][i] = j;
                                            h = false;
                                        }
                                    }
                                }

                            }
                            for (x = 0; x < gavetas.length; x++) {
                                for (w = 0; w < gavetas[x].length; w++) {
                                    if (i - (g - j.clas) <= 0 && i - (g - j.clas) < g) {
                                        if (gavetas[i - g - j.clas][w] != null) {
                                            gavetas[i - g - j.clas][w] = new Jogo();
                                            gavetas[i - g - j.clas][w] = j;
                                            h = false;
                                        }
                                    }
                                }

                            }
                        }
                    }
